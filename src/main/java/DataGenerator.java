import cn.hutool.Hutool;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.util.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class DataGenerator {

    private static String nameString = "Alice, Ben, Bill, Bob, Bruce, Carl, Charles, Chris, David, Evan, Jerry, Joe, John, Lance, Mike, Oscar, Paul, Robin, Thomas, Tom, Tony, Tyler, 中团子, 公孙胜, 关羽, 关胜, 刘备, 刘洋, 刘芳, 卢俊义, 吴十, 吴用, 周瑜, 呼延灼, 大团子, 孙二娘, 孙八, 宋江, 小团子, 张三, 张伟, 张勇, 张磊, 张秀英, 晁盖, 曹操, 李伟, 李军, 李四, 李应, 李强, 李敏, 李明, 李艳, 李逵, 杨九, 林冲, 武松, 燕青, 王丽, 王五, 王伟, 王勇, 王大锤, 王平, 王芳, 王静, 秦明, 诸葛亮, 赵六, 钱七, 鲁智深, 鲁肃, Phoebe";
    private static ArrayList<String> names = new ArrayList<>() {
        {
            this.addAll(Arrays.asList(nameString.split(",")));
        }
    };
    private static final ArrayList<String> units = new ArrayList<>() {
        {
            this.add("中国石油天然气集团公司");
            this.add("中国移动");
            this.add("中国工商银行");
            this.add("阿里巴巴集团");
            this.add("沃尔玛");
            this.add("亚马逊");
            this.add("三星电子");
            this.add("中国平安保险");
            this.add("中国铁路工程集团有限公司");
            this.add("西门子");
            this.add("中粮集团有限公司");
            this.add("中国中信集团有限公司");
            this.add("中国南方电网有限责任公司");
            this.add("索尼");
            this.add("波音");
        }
    };

    public static void main(String[] args) {

        // Generate Data.
        for (String name : names) {

            String unit = units.get(RandomUtil.randomInt(0, units.size() - 1));
            String phone = PhoneGenerator.getMobile();

            if (RandomUtil.randomBoolean()) {
                System.out.println(String.format("%s %s Empty %s Empty", name, unit, phone));
            } else {
                System.out.println(String.format("%s %s %s Empty Empty", name, unit, phone));
            }
        }



    }

}
