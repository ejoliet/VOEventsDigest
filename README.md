# VOEvent client to suscribe to broker and parse voevents in Java

VOEvents: VOEvent is the International Virtual Observatory Alliance standard for describing transient celestial events. See more here http://www.ivoa.net/documents/Notes/VOEventTransport/

To compile:
javac Client.java

To run client:

java -cp . Client

To send voevent, use comet implementation https://github.com/jdswinbank/Comet and run broker sending data/voevent.xml sample:

comet-sendvo -f data/voevent.xml
