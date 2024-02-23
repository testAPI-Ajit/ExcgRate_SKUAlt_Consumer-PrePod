package route;

import com.smarttradzt.integration.spec.model.IntegrationTask;
import com.smarttradzt.integration.spec.route.CommonSOAPConsumerRouteBuilder;
import in.kpmg.iocl.skuapi.SkuAltConversionResponse;
import in.kpmg.iocl.skuapi.ViewSkuAltConvPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KPMGSKUAlternateConversionRoute extends CommonSOAPConsumerRouteBuilder {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public KPMGSKUAlternateConversionRoute(IntegrationTask task) {
        super(task);
    }

	@Override
	protected Class<?> getServiceClassFQN() {
		return ViewSkuAltConvPort.class;
	}

	@Override
	protected Class<?> getResponseClass() {
		return SkuAltConversionResponse.class;
	}
}
