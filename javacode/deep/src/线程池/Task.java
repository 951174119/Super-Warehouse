package 线程池;

import java.util.concurrent.Callable;

class Task implements Callable<String> {
    public Task(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String call() throws Exception {//线程的任务方法
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"  "+""+sum;
    }
}
