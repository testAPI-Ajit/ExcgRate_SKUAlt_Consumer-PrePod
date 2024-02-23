package route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smarttradzt.integration.spec.model.IntegrationTask;
import com.smarttradzt.integration.spec.route.CommonSOAPConsumerRouteBuilder;


public class KPMGExchangeRateRoute extends CommonSOAPConsumerRouteBuilder {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public KPMGExchangeRateRoute(IntegrationTask task) {
        super(task);
    }

	@Override
	protected Class<?> getServiceClassFQN() {
		return in.kpmg.iocl.api.ExchangeData.class;
	}

	@Override
	protected Class<?> getResponseClass() {
		return in.kpmg.iocl.api.ExchangeRateResponse.class;
	}
}
