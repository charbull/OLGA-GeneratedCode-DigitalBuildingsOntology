package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.ITemperature;
import www.google.com.digitalbuildings._0_0_1.subfields.IWetbulb;
import www.google.com.digitalbuildings._0_0_1.subfields.IAir;
import www.google.com.digitalbuildings._0_0_1.subfields.IOutside;
import www.google.com.digitalbuildings._0_0_1.subfields.ISensor;

public interface IOutside_air_wetbulb_temperature_sensor extends IField{

	public IRI iri();

    public void addComposedOfAir (IAir parameter);

	public Set<IAir> getComposedOfAir();

    public void addComposedOfOutside (IOutside parameter);

	public Set<IOutside> getComposedOfOutside();

    public void addComposedOfSensor (ISensor parameter);

	public Set<ISensor> getComposedOfSensor();

    public void addComposedOfTemperature (ITemperature parameter);

	public Set<ITemperature> getComposedOfTemperature();

    public void addComposedOfWetbulb (IWetbulb parameter);

	public Set<IWetbulb> getComposedOfWetbulb();

}