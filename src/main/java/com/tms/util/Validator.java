package com.tms.util;

import com.tms.repository.UserRepository;

public class Validator {
    private final UserRepository userRepository;

    public Validator() {
        userRepository = UserRepository.getInstance();
    }

    public boolean validateUsernameAndPassword(String username, String passwordInput) {
        boolean isValid = passwordInput != null
                && passwordInput.length() >= 3
                && passwordInput.length() <= 20
                && username != null;

        if (!isValid) {
            return false;
        }

        String passwordFromDb = userRepository.getPasswordByUsername(username);
        return passwordInput.equals(passwordFromDb);
    }
}
