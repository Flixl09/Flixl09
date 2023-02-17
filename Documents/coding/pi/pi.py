from gpiozero import LED
import time

led1 = LED(12)
led2 = LED(12)
led3 = LED(12)
led4 = LED(12)

for y in range(1,5):
    x = bin(y)
    if x[2] == "1":
        led1.on()
    if x[3] == "1":
        led2.on()
    if x[4] == "1":
        led3.on()
    if x[5] == "1":
        led4.on()
    
    if x[2] == "0":
        led1.off()
    if x[3] == "0":
        led2.off()
    if x[4] == "0":
        led3.off()
    if x[5] == "0":
        led4.off()
    
    time.sleep(1)
