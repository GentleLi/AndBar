package me.study.andbar.utils;

/**
 * Created by jiantao on 2017/5/23.
 */

public class CheckUtil {


    /**
     * 校验数字范围 000~999
     * @param mSerialNum
     * @return
     */
    public static boolean checkoutNumber(String mSerialNum) {
        if (!StringUtils.isNumeric(mSerialNum)){
            return false;
        }else{
            int serialNumber=Integer.parseInt(mSerialNum);
            if (serialNumber>=1000||serialNumber<0){
                return false;
            }
        }
        return true;
    }

    /**
     * 检查密码合法性 0000~9999
     * @param pwd
     */
    public static boolean checkPassword(String pwd){
        if (!StringUtils.isNumeric(pwd)){
            return false;
        }else{
            if (pwd.length()!=4){
                return false;
            }

            int serialNumber=Integer.parseInt(pwd);
            if (serialNumber>=10000||serialNumber<0){
                return false;
            }
        }
        return true;
    }

}
