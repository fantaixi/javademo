package 泛型;

/**
 * @author fantaixi
 * @create 2020-12-07 15:33
 */
public interface Task {
    void run() throws Exception;

    @SuppressWarnings("unchecked")
    static <T extends Throwable> void throwAs(Throwable t) throws T{
        throw (T) t;
    }
    static Runnable asRunnable(Task task){
        return () ->{
            try {
                task.run();
            }
            catch (Exception e){
                Task.<RuntimeException>throwAs(e);
            }
        };
    }
}
