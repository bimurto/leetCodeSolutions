package com.bimurto.leetcodesolutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Problem621TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<TaskInfo> taskInfoPriorityQueue = new PriorityQueue<>(new Comparator<TaskInfo>() {
            @Override
            public int compare(TaskInfo o1, TaskInfo o2) {
                return o2.count - o1.count;
            }
        });

        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }

        for (int i = 0; i < taskCount.length; i++) {
            if(taskCount[i] > 0){
                TaskInfo taskInfo = new TaskInfo((char) ('A'+i), taskCount[i]);
                taskInfoPriorityQueue.add(taskInfo);
            }
        }

        int result=0;
        while(!taskInfoPriorityQueue.isEmpty()){
            List<TaskInfo> taskInfoList = new ArrayList<>();
            for (int i = 0; i <= n; i++) {

                TaskInfo taskInfo = taskInfoPriorityQueue.poll();
                if(taskInfo == null){
                    if(taskInfoList.isEmpty()){
                        return result;
                    }
                    result++;
                    continue;
                }else{
                    result++;
                }

                if(taskInfo.count > 1) {
                    taskInfoList.add(new TaskInfo(taskInfo.taskName, --taskInfo.count));
                }
            }
            taskInfoPriorityQueue.addAll(taskInfoList);
        }

        return result;
    }

    class TaskInfo {
        char taskName;
        int count;

        public TaskInfo(char taskName, int count) {
            this.taskName = taskName;
            this.count = count;
        }

    }
}
