package homeworkx.rest;

import homeworkx.Orders;
import homeworkx.OrdersContainer;
import lesson10.xmljson.Person;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.*;
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
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    @Path("/bymfr")
    public Viewable getOrdersByMfr(@QueryParam("mfr") String mfr) {
        if (mfr != null && orders.stream().anyMatch(s -> mfr.equals("" + s.getMfr()))) {
            List<Orders> ords = orders.stream().filter(o -> mfr.equals(o.getMfr())).collect(Collectors.toList());
            OrdersContainer ordersContainer = new OrdersContainer(ords);
            return new Viewable("/ords-resp", ordersContainer);
        }
        return new Viewable("/ords");
    }
}