ssh -o "StrictHostKeyChecking no" -t -i cataflix_key_be.ppk cataflix@91.227.139.202 sh stop_service.sh
scp -o "StrictHostKeyChecking no" -i cataflix_key_be.ppk ./target/CataflixBackEnd-0.0.1.jar cataflix@91.227.139.202:/home/cataflix
ssh -o "StrictHostKeyChecking no" -t -i cataflix_key_be.ppk cataflix@91.227.139.202 sh start_service.sh
