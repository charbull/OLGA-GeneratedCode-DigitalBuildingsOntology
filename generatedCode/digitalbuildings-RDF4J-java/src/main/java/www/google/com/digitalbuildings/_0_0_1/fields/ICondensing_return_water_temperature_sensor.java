package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.IWater;
import www.google.com.digitalbuildings._0_0_1.subfields.ITemperature;
import www.google.com.digitalbuildings._0_0_1.subfields.IReturn;
import www.google.com.digitalbuildings._0_0_1.subfields.ICondensing;
import www.google.com.digitalbuildings._0_0_1.subfields.ISensor;

public interface ICondensing_return_water_temperature_sensor extends IField{

	public IRI iri();

    public void addComposedOfCondensing (ICondensing parameter);

	public Set<ICondensing> getComposedOfCondensing();

    public void addComposedOfReturn (IReturn parameter);

	public Set<IReturn> getComposedOfReturn();

    public void addComposedOfSensor (ISensor parameter);

	public Set<ISensor> getComposedOfSensor();

    public void addComposedOfTemperature (ITemperature parameter);

	public Set<ITemperature> getComposedOfTemperature();

    public void addComposedOfWater (IWater parameter);

	public Set<IWater> getComposedOfWater();

}