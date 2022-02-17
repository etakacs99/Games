# Állatverseny
## Feladat:
Az állatmenhely alapítvány kisállat-versenyt rendez. Mindegyik állat regisztrálásakor meg kell adni az állat nevét és a születési évét. Ezek a verseny során nyilván nem változhatnak. Mindegyikőjüket pontozzák, pontot kapnak a szépségükre és a viselkedésükre is.

A pontszám meghatározásakor figyelembe veszik a korukat is (csak év): egy egységesen érvényes maximális kor fölött 0 pontot kapnak, alatta pedig az életkor arányában veszik figyelembe a szépségre és a viselkedésre adott pontokat. Minél fiatalabb, annál inkább a szépsége számít, és minél idősebb, annál inkább a viselkedése. (Ha pl. 10 év a maximális kor, akkor egy 2 éves állat pontszáma: (10-2)*a szépségére adott pontok + 2* a viselkedésére kapott pontok.)

Az állatok adatainak kiíratásához írjuk meg az állat nevét és pontszámát tartalmazó toString() metódust.

Írjon versenyeztető programot, vagyis:

- Legyen regisztráció (azaz olvassa be az állatok adatait – lehetőleg fájlból)

- Versenyeztesse őket – ez azt jelenti, hogy minden egyes állatot véletlen pontszámmal értékel a zsűri

- Verseny előtt és után is írassa ki a résztvevőket (név, pontszám)

- Állapítsa meg, hogy ki(k) a nyertes(ek).

- Írassa ki a résztvevőket pontszám szerint csökkenően.