package com.example.card_production.Akbor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputSteam extends ObjectOutputStream {
    public AppendableObjectOutputSteam(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
//        reset();// do nothing → this prevents writing a new header
    }
}
