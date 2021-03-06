package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.IRun;
import www.google.com.digitalbuildings._0_0_1.subfields.IHumidification;

public interface IHumidification_run_command extends IField{

	public IRI iri();

    public void addComposedOfCommand (ICommand parameter);

	public Set<ICommand> getComposedOfCommand();

    public void addComposedOfHumidification (IHumidification parameter);

	public Set<IHumidification> getComposedOfHumidification();

    public void addComposedOfRun (IRun parameter);

	public Set<IRun> getComposedOfRun();

}