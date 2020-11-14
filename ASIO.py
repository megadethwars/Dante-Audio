import argparse
import queue
import sys
import sounddevice as sd2
import socket
import time as t
import numpy as np
import threading as th
import tkinter


dispositivo =  3
MCAST_GRP = "224.0.0.3"
MCAST_PORT = 5001
MCAST_PORT2 = 10002
canales = 32

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM, socket.IPPROTO_UDP)
sock.setsockopt(socket.IPPROTO_IP,socket.IP_MULTICAST_TTL,2)

sock2 = socket.socket(socket.AF_INET, socket.SOCK_DGRAM, socket.IPPROTO_UDP)



def audio_callback(indata, frames, time, status):
    """This is called (from a separate thread) for each audio block."""
    c = np.transpose(indata)
    h = np.concatenate(c,axis=0)
    #print("popo",np.sum(indata,axis=1),"popo")3
    #print("po",np.sum(indata,axis=1),"po")
    #print(indata)
    #h = np.sum(indata,axis=1)
    #tou=h.byteswap()
    #total=tou.tobytes()
    
    sock.sendto(h.tobytes(),(MCAST_GRP, MCAST_PORT))


import sounddevice as sd   

sd.default.device = dispositivo
sd.default.latency = 'low'
sd.default.samplerate = 44100
sd.default.dtype = 'int16'
sd.default.blocksize = 64
def sonido():
    try:
        print("canal 1")
        with sd.InputStream(
            channels=canales,
            callback=audio_callback):
            
        
            while True:
                input()

    except Exception as e:
        print(e)


#sonido()

h1 = th.Thread(target=sonido)
h1.start()
