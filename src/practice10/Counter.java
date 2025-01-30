package practice10;

import java.util.ArrayList;

class Counter {


    int  count;

    public synchronized void increment() {

        count++;
    }
    public int getCount() {
        return count;
    }
}


