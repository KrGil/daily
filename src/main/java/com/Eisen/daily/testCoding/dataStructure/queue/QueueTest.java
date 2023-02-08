package com.Eisen.daily.testCoding.dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : com.Eisen.daily.testCoding.dataStructure.queue
 * fileName : QueueTest
 * author : eisen
 * date : 2023-01-30
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-30    AUTHOR: eisen    NOTE: 최초 생성
 */
public class QueueTest {
    public void queueOperTest(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.stream().reduce(Integer::sum).orElse(0));;
        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());
        queue.offer(4);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());

    }
}
