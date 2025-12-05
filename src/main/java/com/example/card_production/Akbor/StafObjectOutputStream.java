package com.example.card_production.Akbor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class StafObjectOutputStream extends ObjectOutputStream {
    public StafObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected void writeStreamHeader(){
//
    }
}
