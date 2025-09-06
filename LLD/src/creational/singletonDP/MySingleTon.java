package creational.singletonDP;

public class MySingleTon {

    /**
     * Eagerly initialize
     */
/*
    private static final MySingleTon mySingleTon = new MySingleTon();

    private MySingleTon() {}

    public static MySingleTon getInstance(){ return mySingleTon;}

*/

    /**
     * Lazy initialize
     */
/*    private static MySingleTon mySingleTon;
    private MySingleTon() {}
    public static MySingleTon getInstance(){

        if (mySingleTon == null){
            mySingleTon = new MySingleTon();
        }
        return mySingleTon;

    }*/

    // Object declaration
/*
    private static MySingleTon instance;

    // Private constructor
    private MySingleTon() {}

    // Synchronized keyword used
    public static synchronized MySingleTon getInstance() {
        if (instance == null) {
            instance = new MySingleTon();
        }
        return instance;
    }
*/

    /**
     * A volatile variable is read from and written to main memory directly, not from a thread's local cache.
     */
    private static volatile MySingleTon instance;

    // Private constructor
    private MySingleTon() {
    }

    // Thread-safe method using double-checked locking
    public static MySingleTon getInstance() {
        if (instance == null) {
            synchronized (MySingleTon.class) {
                if (instance == null) {
                    instance = new MySingleTon();
                }
            }
        }
        return instance;
    }

}
