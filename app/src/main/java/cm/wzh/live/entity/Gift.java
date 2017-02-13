package cm.wzh.live.entity;

import java.io.Serializable;

/**
 * Created by WZH on 2016/12/25.
 */

public class Gift implements Serializable{
    public String price ;
    public String giftName ;
    public int giftType ;
    public int num ;
    public String img ;

    @Override
    public boolean equals(Object obj) {
        Gift bean = (Gift) obj;

        if (bean.giftName.equals(giftName)) {
            return true;
        }
        return false;
        //return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Gift{" +
                "price='" + price + '\'' +
                ", giftName='" + giftName + '\'' +
                ", giftType=" + giftType +
                ", num=" + num +
                ", img='" + img + '\'' +
                '}';
    }
}
