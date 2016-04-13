package de.hska.iwi.vislab.lab1.example.ws;

import javax.jws.WebService;

/**
 * Created by deckelt on 13/04/16.
 */
@WebService(endpointInterface = "de.hska.iwi.vislab.lab1.example.ws.FibonacciService")
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public int getFibonacci(int n) {
        return (n == 1 || n == 2) ? 1 : getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
