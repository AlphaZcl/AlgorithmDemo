package com.zcl.algorith;

import main.com.zcl.entity.JsoepfuEntity;

/**
 * jsoepfu问题
 *
 * @author zclys
 * @date 2020/8/19 14:53
 */
public class JsoepfuLinkedList {

    /**
     * 空节点，作为无头节点环形链表入口
     */
    private JsoepfuEntity first = null;

    /**
     * 辅助节点，作为环形链表遍历辅助指针，初始指向first
     */
    private JsoepfuEntity curNode = null;

    private void add(JsoepfuEntity person){
        if(first == null){
            first = person;
            //形成环形
            first.setNext(first);
        }else{
            if(curNode == null){
                curNode = first;
            }
            while(curNode.getNext() != first){
                curNode = curNode.getNext();
            }
            curNode.setNext(person);
            person.setNext(first);
            //将curNode移到最后一个节点
            curNode = curNode.getNext();
        }
    }

    /**
     * jsoepfu问题解决方法
     * @param n n个人
     * @param k 从第k个人开始报数
     * @param m 报数多少出圈
     */
    public String execute(int n,int k,int m){
        if(n<1 || k<1||k>n){
            throw new RuntimeException("参数有误");
        }
        //生成环形链表
        for(int i=1;i<=n;i++){
            JsoepfuEntity person = new JsoepfuEntity();
            person.setNo(i);
            add(person);
        }
        //初始化开始报数位置
        for(int i=0;i<k-1;i++){
            first = first.getNext();
            curNode = curNode.getNext();
        }
        //进行出圈操作，报数出圈
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while(curNode != first){
            for(int i=0;i<m-1;i++){
                first = first.getNext();
                curNode = curNode.getNext();
            }
            builder.append(first.getNo());
            builder.append(",");
            curNode.setNext(first.getNext());
            first = first.getNext();
        }
        //还剩最后一个
        builder.append(first.getNo());
        builder.append("]");
        return builder.toString();
    }
}
