package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.IWater;
import www.google.com.digitalbuildings._0_0_1.subfields.IReturn;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.ICondensing;
import www.google.com.digitalbuildings._0_0_1.subfields.IIsolation;
import www.google.com.digitalbuildings._0_0_1.subfields.IValve;

public interface ICondensing_return_water_isolation_valve_command extends IField{

	public IRI iri();

    public void addComposedOfCommand (ICommand parameter);

	public Set<ICommand> getComposedOfCommand();

    public void addComposedOfCondensing (ICondensing parameter);

	public Set<ICondensing> getComposedOfCondensing();

    public void addComposedOfIsolation (IIsolation parameter);

	public Set<IIsolation> getComposedOfIsolation();

    public void addComposedOfReturn (IReturn parameter);

	public Set<IReturn> getComposedOfReturn();

    public void addComposedOfValve (IValve parameter);

	public Set<IValve> getComposedOfValve();

    public void addComposedOfWater (IWater parameter);

	public Set<IWater> getComposedOfWater();

}