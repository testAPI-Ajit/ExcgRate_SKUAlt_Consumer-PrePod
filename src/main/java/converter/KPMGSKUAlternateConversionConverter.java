package converter;

import com.smarttradzt.integration.spec.converter.SKUAlternateConversionDataConverter;
import com.smarttradzt.integration.spec.model.SKUAlternateConversionResponse;

import in.kpmg.iocl.skuapi.SkuAltConversion;
import in.kpmg.iocl.skuapi.SkuAltConversionRequest;

import java.util.ArrayList;

public class KPMGSKUAlternateConversionConverter
		implements SKUAlternateConversionDataConverter<SkuAltConversionRequest, in.kpmg.iocl.skuapi.SkuAltConversionResponse> {

	@Override
	public SkuAltConversionRequest convertOutbound(String materialNo) {

		SkuAltConversionRequest input = new SkuAltConversionRequest();
		input.setMaterialNo(materialNo);

		return input;
	}

	@Override
	public SKUAlternateConversionResponse convertInbound(in.kpmg.iocl.skuapi.SkuAltConversionResponse output, String product) {
		SKUAlternateConversionResponse response = new SKUAlternateConversionResponse();
		response.setItems(new ArrayList<>());

		SKUAlternateConversionResponse.Item item = new SKUAlternateConversionResponse.Item();

		item.setProduct(product);
		item.setConversions(new ArrayList<>());

		response.getItems().add(item);

		for (SkuAltConversion so : output.getSkuAltConversion()) {
			if (so == null)
				continue;
			SKUAlternateConversionResponse.ItemConversion itemConversion = new SKUAlternateConversionResponse.ItemConversion();

			itemConversion.setFromUOM(so.getUnitOfMeasureDisplay());
			itemConversion.setToUOM(so.getBaseUnitOfMeasure());

			double conversion = Double.parseDouble(so.getNumeratorConversion())
					/ Double.parseDouble(so.getDenominatorConversion());
			itemConversion.setConversion(conversion);

			item.getConversions().add(itemConversion);
		}

		return response;
	}

}