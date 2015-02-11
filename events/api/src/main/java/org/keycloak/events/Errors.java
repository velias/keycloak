package org.keycloak.events;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public interface Errors {

    String REALM_DISABLED = "realm_disabled";

    String CLIENT_NOT_FOUND = "client_not_found";
    String CLIENT_DISABLED = "client_disabled";
    String INVALID_CLIENT_CREDENTIALS = "invalid_client_credentials";
    String INVALID_CLIENT = "invalid_client";

    String USER_NOT_FOUND = "user_not_found";
    String USER_DISABLED = "user_disabled";
    String USER_TEMPORARILY_DISABLED = "user_temporarily_disabled";
    String INVALID_USER_CREDENTIALS = "invalid_user_credentials";

    String USERNAME_MISSING = "username_missing";
    String USERNAME_IN_USE = "username_in_use";
    String EMAIL_IN_USE = "email_in_use";

    String INVALID_REDIRECT_URI = "invalid_redirect_uri";
    String INVALID_CODE = "invalid_code";
    String INVALID_TOKEN = "invalid_token";
    String INVALID_SIGNATURE = "invalid_signature";
    String INVALID_REGISTRATION = "invalid_registration";
    String INVALID_FORM = "invalid_form";
    String EXPIRED_CODE = "expired_code";

    String REGISTRATION_DISABLED = "registration_disabled";

    String REJECTED_BY_USER = "rejected_by_user";

    String NOT_ALLOWED = "not_allowed";

    String IDENTITY_PROVIDER_NOT_FOUND = "identity_provider_not_found";
    String FEDERATED_IDENTITY_EMAIL_EXISTS = "federated_identity_email_exists";
    String FEDERATED_IDENTITY_USERNAME_EXISTS = "federated_identity_username_exists";
    String FEDERATED_IDENTITY_DISABLED_REGISTRATION = "federated_identity_disabled_registration";
    String SSL_REQUIRED = "ssl_required";

    String USER_SESSION_NOT_FOUND = "user_session_not_found";

    String EMAIL_SEND_FAILED = "email_send_failed";
    String INVALID_EMAIL = "invalid_email";
}
