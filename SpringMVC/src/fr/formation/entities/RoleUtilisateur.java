package fr.formation.entities;

public enum RoleUtilisateur {
    ROLE_USER, ROLE_ADMIN, ROLE_GUEST, ROLE_ROOT;

    public String getName() {
	return name();
    }
}
