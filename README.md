# Track.io
BME témalabor csoportos app
</br>
# Első alkalom:
 Főbb funkciók átbeszélése, azokhoz információk gyűjtése és design ötletelés.
 Felhasználói klien és admin kliens átbeszélése, tervezése.
</br>

## Tervezett elemek
### Kezdőképernyő: 
![](Mockup_Screens/Registration%401x.png)</br>
Regisztráció (alap adatok megadása, személyes profil(testsúly, magasság, nem))

### Főmenü:
![](Mockup_Screens/Home%20screen%401x.png)
- Aznapi aktivitás megjelenítése, lépés, kalória és megtett táv adatokkal
- Aktivitás történet melyben pár előző aktivitás jelenik meg azok adataival és időpontjával (pl. Walkinghistory)
- Testsúly megjelenítése, rögzítés időpontjával

### Edzés Menü:
![](Mockup_Screens/WorkoutMenu%401x.png)
- Három fő sport megjelenítése (séta, futás, biciklizés), az adott sportban az össz megtett kilométer
- Az adott sportokhoz tartozó aktivitások megjelenítése
- Konkrét edzésekhez tartozó statisztiák megjelenítése(idő, táv, térképes nézet)
- Gyerünk “gomb” amellyel el lehet kezdeni egy adott aktivitást

### Aktivitás képernyő
![](Mockup_Screens/LockedWorkout%401x.png)
![](Mockup_Screens/UnlockedWorkout%401x.png)
- Megjelenik az aktuális aktivitás távja, és sporttól függően más mértékegységben különböző statisztikák
- Az adott aktivitás szüneteltethető és újra indítható, és természetesen megállítható
- Aktivitás végeztével az adatok elmentődnek a backenden, továbbá gpx letölthető a felhaszálónak
- Rendelkezik zároltképernyős verzióval

### Profile menü
![](Mockup_Screens/ProfileMenu%401x.png)
- A felhasználó személyes adatai találhatók itt 
- A személyes célokat itt lehet megadni, amelyek elérésében segít az alkalmazás

### History menük
![](Mockup_Screens/WalkingHistory%401x.png)
- A felhasználó napokra lebontva megtekintheti korábbi eredményeit

## Értesítések
- Ha egy héten belül nem volt új testsúly érték rögzítve az appban akkor értesítést küld a felhasználónak az applikáció, hogy rögzzítsen egy újat
- Ha aktivitás/tracking van folyamatban az értesítési sávon megjelenik az adott aktivitás statisztikái
- Aktiális aktivitás közbeni kilométerek miatti értesítés(rezgés)
- Minimális sebesség alácsökkenés jelzése
- Napi cél elérése
- Nap végéhez közeledve értesítés jelzése, hogy nem lett még elérve a napi cél

## További featurek:
- Daily, Weekly challanges, megjelenik egy adott táv, melyet teljesíteni lehet a felhaszálónak

## Esetleges featurek
- Spotify aktivitás kezdésekor felkinálja az app, hogy zenét szeretnél-e indítani ekkor megnyithatod a spotifyt.

## Admin kliens feladata:
Challangek kiírása melyekhez GPX-ben megadott útvonalakat kell teljesíteni vagy szabad útvonalakon adott távokat, ezekhez időintervallum megadása, hogy meddig lehet az adott challenget teljesíteni.
