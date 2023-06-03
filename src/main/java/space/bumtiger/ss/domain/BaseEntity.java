package space.bumtiger.ss.domain;

import java.io.Serial;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseEntity implements Serializable {
	/**
	*
	*/
	@Serial
	private static final long serialVersionUID = -7363399724812884337L;

	@Id
	@Column
	protected Long id;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!this.getClass().isInstance(o))
			return false;

		BaseEntity other = (BaseEntity) o;

		return id != null && id.equals(other.getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
