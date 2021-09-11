package visitor;

    //消费的单子---抽象账本的实现类
    public class ConsumeBill implements Bill{
         //消费的金额
        private double amount;
        //消费的武平
        private String item;
        //构造方法为这两个属性赋值
        public ConsumeBill(double amount, String item) {
            super();
            this.amount = amount;
            this.item = item;
        }
        //提供让访问者访问当前账单中消费部分的方法
        public void accept(AccountBookViewer viewer) {
            //调用访问者的view方法，执行对消费部分账单访问的具体业务逻辑
            viewer.view(this);
        }

        public double getAmount() {
            return amount;
        }

        public String getItem() {
            return item;
        }

    }

