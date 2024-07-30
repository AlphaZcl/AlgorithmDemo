package main.com.zcl.entity;

/**
 * 约瑟夫问题实体类
 *
 * @author zclys
 * @date 2020/8/19 14:55
 */
public class JsoepfuEntity {

    private int no;

    private JsoepfuEntity next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public JsoepfuEntity getNext() {
        return next;
    }

    public void setNext(JsoepfuEntity next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "JsoepfuEntity{" +
                "no=" + no +
                '}';
    }
}
