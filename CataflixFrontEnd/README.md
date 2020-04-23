# Cataflix Front-end

## Alkalmazott technológiák
Angular 2 keretszrendszer (9.0.4) verzió [Angular](https://angular.io/).

### Build
Az alkalmazás fordításához szükséges a [Node package manager](https://nodejs.org/en/) telepítése, továbbá a Node telepítése után az Angular telepítése szükséges (npm install -g @angular/cli) parancssorból.
A build scriptek windows esetén: [script](build.ps1) Linux/MAC: [script](build.sh). Az alkalmazás localhost:4200 címen érhető el.

### Lint
Az alkalmazás build során lefuttatja a lint parancsot, mely elemzi a forráskódokat, és esetleges hibákra figyelmeztet.
ng Lint paranccsal fut, és a build script utolsó soraiban található meg az eredménye.

