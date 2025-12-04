package com.example.card_production;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputSteam extends ObjectOutputStream {
    public AppendableObjectOutputSteam(OutputStream out) throws IOException {
        super(out);
    }

    protected void writeStreamHeader() throws IOException{

    }
}
