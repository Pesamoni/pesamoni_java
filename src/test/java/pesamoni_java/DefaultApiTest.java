package pesamoni_java;

import psm.ApiException;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Below are parameters and their respective expected responses. In order to try out the service, simply click Try it out.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsPostTest() throws ApiException {
        String method = null;
        String amount = null;
        String mobile = null;
        String holdername = null;
        String cardnumber = null;
        String cvv = null;
        String exp = null;
        String currency = null;
        String account = null;
        String reference = null;
        String genericmsg = null;
        String token = null;
        String bouquet = null;
        String payoption = null;
        String meternumber = null;
        InlineResponse200 response = api.transactionsPost(method, amount, mobile, holdername, cardnumber, cvv, exp, currency, account, reference, genericmsg, token, bouquet, payoption, meternumber);

        // TODO: test validations
    }
    
}
