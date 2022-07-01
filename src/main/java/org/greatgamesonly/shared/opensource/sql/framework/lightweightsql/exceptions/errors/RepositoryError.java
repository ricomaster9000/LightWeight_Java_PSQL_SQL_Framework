package org.greatgamesonly.shared.opensource.sql.framework.lightweightsql.exceptions.errors;


public class RepositoryError extends CustomError {

    public static final RepositoryError REPOSITORY_GET__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00100", "Error getting entity data from database",
            500);
    public static final RepositoryError REPOSITORY_RUN_QUERY__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00101", "Error running query on database",
            500);
    public static final RepositoryError REPOSITORY_INSERT__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00102", "Error inserting entity into database",
            500);
    public static final RepositoryError REPOSITORY_PREPARE_INSERT__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00102b", "Error preparing insert entity into database",
            500);
    public static final RepositoryError REPOSITORY_INSERT_CONSTRAINT_VIOLATION_ERROR = new RepositoryError(RepositoryError.class.getName()+"_00102c", "Error inserting entity into database because inserted data violates a unique db constraint",
            500);
    public static final RepositoryError REPOSITORY_PREPARE_CLASS__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00103", "Error getting repository class data ready",
            500);
    public static final RepositoryError REPOSITORY_UPDATE_ENTITY__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00104", "Error when updating entities",
            500);
    public static final RepositoryError REPOSITORY_DELETE_ENTITY__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00105", "Error when deleting entities",
            500);
    public static final RepositoryError REPOSITORY_UPDATE_ENTITY_WITH_ENTITY__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00106", "Error when updating an entity with an entity",
            500);
    public static final RepositoryError REPOSITORY_COUNT_BY_FIELD__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00107", "Error counting number of records in database by column name",
            500);
    public static final RepositoryError REPOSITORY_CALL_REFLECTION_METHOD__ERROR = new RepositoryError(RepositoryError.class.getName()+"_00108", "Error calling method via reflection",
            500);

    RepositoryError(String errorCode, String reason, int httpStatusCode) {
        super(errorCode,reason,httpStatusCode);
    }
}
