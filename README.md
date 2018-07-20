# VOEvent client to suscribe to broker and parse voevents in Java

To compile:
javac Client.java

To run client:

java -cp . Client

To send voevent, use comet implementation https://github.com/jdswinbank/Comet and run broker sending data/voevent.xml sample:

comet-sendvo -f data/voevent.xml
