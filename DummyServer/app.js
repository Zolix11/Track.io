const bodyParser = require('body-parser')
const express = require('express')
const https = require('https')
const fs = require('fs')
const bcrypt = require('bcrypt')
const passport = require('passport')
const session = require('express-session')

const adminRoutes = require('./routes/admin')
const challangeRoutes = require('./routes/challenges')
const userdetRoutes = require('./routes/userdetails')
const userworkRoutes = require('./routes/userworkout')
const authRoutes = require('./routes/auth')

const users = []
const app = express()
const options = {
  key: fs.readFileSync('key.pem'),
  cert: fs.readFileSync('cert.pem')
}

const initializePassport = require('./utils/passport-config')
initializePassport(
  passport,
  email => users.find(user => user.email === email),
  id => users.find(user => user.id === id)
)

app.use(session({
  secret: bcrypt.randomBytes(20).toString("hex"),
  resave: false,
  saveUninitialized: false
}))
app.use(passport.initialize())
app.use(passport.session())



app.use('/', (req, res, next)=>{
  console.log("incoming request")
  next()
})

app.post('/', bodyParser.urlencoded({extended: false}))

router.post('/signup', checkNotAuthenticated, (req, res, next) =>{
  try{
    const hashedPassword = bcrypt.hash(req.body.password, 10)
    users.push({
      id: Date.now().toString(),
      firstName: req.body.firstName,
      lastName: req.body.lastName,
      email: req.body.email,
      gender: req.body.gender,
      weight: req.body.weight,
      height: req.body.height,
      dateOfBirth: req.body.dateOfBirth,
      password: hashedPassword
    })
    res.status(200)
  }catch{
    res.status(400)
  }
})

router.post('/login', checkNotAuthenticated, passport.authenticate('local', {
  successMessage: 'OK',
  failureMessage: 'login failed'
}))

app.get('/logout', checkAuthenticated, (req, res) => {
  req.logOut()
  res.status(200)
})

app.use('/userdetails', checkAuthenticated, userdetRoutes)
app.use('/userWorkout', checkAuthenticated, userworkRoutes)
app.use('/challanges', checkAuthenticated , challangeRoutes)
app.use('/admin', checkAuthenticated, adminRoutes)


function checkAuthenticated(req, res, next) {
  if (req.isAuthenticated()) {
    return next()
  }

  res.status(401)
}

function checkNotAuthenticated(req, res, next) {
  if (req.isAuthenticated()) {
    return res.status(401)
  }
  next()
}

https.createServer(options, app).listen(443)