npm install
ng build --prod --build-optimizer --base-href=/
ng lint --typeCheck=false --force=true --silent=true
sh ./deploy.sh