public abstract  class OnlineShopping {
    public  final void browseGoods(){
        System.out.println("浏览页面");
    }
    public   final void selectGoods(){
        System.out.println("选择商品");
    }
    public abstract void callService();
    public final void computerPrice(){
        System.out.println("结算");
    }
    public  abstract void orderPay();
    public  abstract void sendService();
    public final void showOrder(){
        System.out.println("显示订单");
    }
    final void Process(){
        browseGoods();
        selectGoods();
        callService();

        computerPrice();
        orderPay();
        showOrder();
    }

    public static void main(String[] args) {


        class JD extends OnlineShopping {
            @Override
            public void callService() {
                System.out.println("京东平台为您服务");
            }

            @Override
            public void orderPay() {
                System.out.println("微信支付");
            }

            @Override
            public void sendService() {
                System.out.println("京东平台正在配送");
            }

        }
    }

}
