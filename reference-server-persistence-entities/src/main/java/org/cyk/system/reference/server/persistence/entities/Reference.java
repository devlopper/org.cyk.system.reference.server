package org.cyk.system.reference.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=Reference.TABLE)
public class Reference extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull @Column(name=COLUMN_VALUE,nullable=false,unique=true,length = 512)
	private String value;
	
	@Override
	public Reference setIdentifier(String identifier) {
		return (Reference) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_VALUE = "value";
	
	public static final String COLUMN_VALUE = FIELD_VALUE;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"reference";
	
}
