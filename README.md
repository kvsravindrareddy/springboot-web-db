# springboot-web-db

This application provides the database connectivity and the TransactionRollback using Spring Data JPA.

public void createProductCart() {
        try {
            transactionTemplate.execute(new TransactionCallbackWithoutResult() {
                @Override
                protected void doInTransactionWithoutResult(TransactionStatus status) {
                    boolean flag = false;
                    productService.save();
                    if (!flag) {
                        System.out.println(1 / 0);
                        cartService.save();
                    }
                }
            });
        }catch (Exception e) {
            e.printStackTrace();;
            throw new BusinessException("Exception occurred while processing the request");
        }
    }
