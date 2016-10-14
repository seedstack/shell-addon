/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.shell.internal;

import org.seedstack.seed.ErrorCode;

enum ShellErrorCode implements ErrorCode {
    COMMAND_PARSING_ERROR,
    COMMAND_SYNTAX_ERROR,
    ILLEGAL_MODE,
    ILLEGAL_MODE_OPTION,
    MISSING_COMMAND,
    MODE_SYNTAX_ERROR,
    OPTIONS_SYNTAX_ERROR
}
