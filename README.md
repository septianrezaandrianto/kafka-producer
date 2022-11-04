# kafka-producer

# Environment need
#Before you running this service don't forget for run kafka server in your machine.\
#You can download kafka server using this link : https://kafka.apache.org/downloads \
#After you extract the kafka server zip file, \
#don't forget edit the <u>zookeper.properties</u> file and <u>server.properties</u> file under the config folder. \
#You can't follow the tutorial from this link : https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/ (for windows users).

#If you have run the kafka server. \
#You can run this project and hit the endpoint for testing that your configuration has successful. \
#If you want to check your producer has sent message into your topic you can open new terminal into your kafka server folder \
#and write this command : .\bin\windows\kafka-console-consumer.bat --topic <your_topic_name> --from-beginning --bootstrap-server localhost:9092
