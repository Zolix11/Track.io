const express = require('express')

const router = express.Router()

router.post('/signup', (req, res, next) =>{
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

router.post('/login', (req, res, next)=>{

})

module.exports = router