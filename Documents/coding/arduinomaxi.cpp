const int startPin = 2; // Start-Input-Pin
const int opvinPin = 3; // "opvin"-Input-Pin
const int outputPin1 = 4; // Erster Output-Pin
const int outputPin2 = 5; // Zweiter Output-Pin
const int outputPin3 = 6; // Dritter Output-Pin

void setup() {
  pinMode(startPin, INPUT); // Start-Input-Pin als Input definieren
  pinMode(opvinPin, INPUT); // "opvin"-Input-Pin als Input definieren
  pinMode(outputPin1, OUTPUT); // Erster Output-Pin als Output definieren
  pinMode(outputPin2, OUTPUT); // Zweiter Output-Pin als Output definieren
  pinMode(outputPin3, OUTPUT); // Dritter Output-Pin als Output definieren
}

void loop() {
  int startState = digitalRead(startPin); // Start-Input lesen
  int opvinState = digitalRead(opvinPin); // "opvin"-Input lesen

  if (startState == HIGH && opvinState == LOW) { // Wenn Start-Input erkannt wird und "opvin" nicht aktiv ist
    digitalWrite(outputPin1, HIGH); // Ersten Output-Pin aktivieren
    digitalWrite(outputPin2, HIGH); // Zweiten Output-Pin aktivieren
    digitalWrite(outputPin3, HIGH); // Dritten Output-Pin aktivieren

    // Dauerhaften Output mit einer Frequenz von 30 kHz erzeugen
    while(true) {
      digitalWrite(outputPin3, HIGH);
      delayMicroseconds(16);
      digitalWrite(outputPin3, LOW);
      delayMicroseconds(16);
    }
  } else { // Wenn Start-Input nicht erkannt wird oder "opvin" aktiv ist
    digitalWrite(outputPin1, LOW); // Ersten Output-Pin deaktivieren
    digitalWrite(outputPin2, LOW); // Zweiten Output-Pin deaktivieren
    digitalWrite(outputPin3, LOW); // Dritten Output-Pin deaktivieren
  }
}