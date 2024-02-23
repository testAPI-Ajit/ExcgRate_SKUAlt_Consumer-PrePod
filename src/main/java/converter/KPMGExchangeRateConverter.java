package converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import in.kpmg.iocl.api.AllExchange;
import org.apache.commons.lang3.StringUtils;

import com.smarttradzt.integration.spec.converter.ExchangeRouteDataConverter;
import com.smarttradzt.integration.spec.model.ExchangeRateRequest;
import com.smarttradzt.integration.spec.model.ExchangeRateResponse;
import com.smarttradzt.integration.spec.util.NumberUtil;


public class KPMGExchangeRateConverter implements ExchangeRouteDataConverter<in.kpmg.iocl.api.ExchangeRateRequest, in.kpmg.iocl.api.ExchangeRateResponse> {

	@Override
	public in.kpmg.iocl.api.ExchangeRateRequest convertOutbound(ExchangeRateRequest request) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		in.kpmg.iocl.api.ExchangeRateRequest  input = new in.kpmg.iocl.api.ExchangeRateRequest ();
		input.setFromCurrency(request.getFromCurrency());
		input.setToCurrency(request.getToCurrency());
		input.setExchangeType(request.getExchangeRateType());
		String date = request.getEffectiveDate().format(formatter);
		input.setEffectiveDate(date);
		return input;
	}

	@Override
	public ExchangeRateResponse convertInbound(in.kpmg.iocl.api.ExchangeRateResponse output) {
		DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");

		if (output.getExchange().size() < 1)
			return null;

		ExchangeRateResponse resp = new ExchangeRateResponse();

		in.kpmg.iocl.api.AllExchange allExc = output.getExchange().get(0);

		resp.setExchangeRateType(allExc.getExchangeType());
		resp.setFromCurrency(allExc.getFromCurrency());
		resp.setToCurrency(allExc.getToCurrency());
		resp.setRate(NumberUtil.zeroIfNulll(allExc.getExchangeRate()));
		resp.setRatioFrom(NumberUtil.zeroIfNulll(allExc.getFromCurrencyRatio()));
		resp.setRatioTo(NumberUtil.zeroIfNulll(allExc.getToCurrencyRatio()));
		resp.setEffectiveDate(LocalDateTime.parse(allExc.getEffectiveDate() + " 00:00:00", outFormatter));
		return resp;
	}
}
