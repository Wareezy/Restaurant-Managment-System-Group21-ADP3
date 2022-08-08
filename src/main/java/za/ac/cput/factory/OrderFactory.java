package za.ac.cput.factory;

import za.ac.cput.domain.Order;

public class OrderFactory {
    public static Order createOrder(String orderId, String orderDetails, String customerId, String waiterId, String chefId){
    if (StringHelper.isNullOrEmpty(orderId))
        throw new IllegalArgumentException();
        if (StringHelper.isNullOrEmpty(orderDetails))
            throw new IllegalArgumentException();
        if (StringHelper.isNullOrEmpty(customerId))
            throw new IllegalArgumentException();
        if (StringHelper.isNullOrEmpty(waiterId))
            throw new IllegalArgumentException();
        if (StringHelper.isNullOrEmpty(chefId))
            throw new IllegalArgumentException();

        return new Order.Builder().setOrderId(orderId)
                .setChefId(chefId)
                .setOrderDetails(orderDetails)
                .setCustomerId(customerId)
                .setWaiterId(waiterId)
                .build();
    }
}
