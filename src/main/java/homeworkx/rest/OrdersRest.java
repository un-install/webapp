package homeworkx.rest;

import homeworkx.Orders;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/orders")
public class OrdersRest {
    private static List<Orders> orders = Orders.getOrdersSet();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllOrders(){
            return Response.status(Response.Status.OK).entity(orders).type(MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getOrderById(@PathParam("id") double id){
        Orders order = orders.stream().filter( o -> o.getOrderNum() == id).collect(Collectors.toList()).get(0);
        if (order != null) {
            return Response.status(Response.Status.OK).entity(order).type(MediaType.APPLICATION_JSON).build();
        }
        return Response.status(404).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("")
    public Response getOrderByMfr(@PathParam("mfr") String mfr){
        List<Orders> ordersResp = orders.stream().filter( o -> o.getMfr().equals(mfr)).collect(Collectors.toList());
        if (ordersResp != null) {
            return Response.status(Response.Status.OK).entity(ordersResp).type(MediaType.APPLICATION_JSON).build();
        }
        return Response.status(404).build();
    }
}