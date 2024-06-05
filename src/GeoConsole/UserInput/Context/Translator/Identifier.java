package GeoConsole.UserInput.Context.Translator;

public enum Identifier {
    // AnyTriangle
    ERR_SIDE_LENGTHS,

    // Circle
    ERR_CIRCLE_ARGUMENT,
    FIG_CIRCLE_DESCRIPTION,

    // Ellipse
    FIG_ELLIPSE_DESCRIPTION,

    // Equilateral Triangle
    FIG_TRIANGLE_EQUILATERAL_TYPE,

    // Figure
    ERR_FIGURE_NOT_EXISTS,
    ERR_N_GREATER,
    ERR_POSITIVE_TOO_MANY,
    ERR_POSITIVE_TOO_LITTLE,
    ERR_UNREACHABLE,

    // Isosceles Trapezoid
    FIG_TRAPEZOID_ISOSCELES_DESCRIPTION,

    // Isosceles Triangle
    FIG_TRIANGLE_ISOSCELES_TYPE,

    // Rectangle
    ERR_RECTANGULAR_ARGUMENT,
    FIG_RECTANGLE_DESCRIPTION,

    // Rhombus
    FIG_RHOMBUS_DESCRIPTION,
    ERR_RHOMBUS_CIRCUMSCRIBE,

    // Right Triangle
    FIG_TRIANGLE_RIGHT_TYPE,

    // Square
    FIG_SQUARE_DESCRIPTION,

    // Triangle
    FIG_TRIANGLE_BASE_TYPE,
    FIG_TRIANGLE_BASE_DESCRIPTION,
    ERR_TRIANGLE_ARGUMENT,

    // Language Command
    COM_LANGUAGE_DESCRIPTION,

    COM_EXIT_DESCRIPTION,
    COM_SAVE_DESCRIPTION,
    COM_HELP_DESCRIPTION,

    COM_CIRCLE_DESCRIPTION,
    COM_CIRCUMCIRCLE_DESCRIPTION,
    COM_DOUBLEFIGURE_DESCRIPTION,
    COM_ELLIPSE_DESCRIPTION,
    COM_EQUILATERALTRIANGLE_DESCRIPTION,
    COM_ISOSCELESTRAPEZOID_DESCRIPTION,
    COM_ISOSCELESTRIANGLE_DESCRIPTION,
    COM_VERSION_DESCRIPTION,
    ERR_UNSUPPORTED_LANGUAGE,
    TXT_LANGUAGE_CHANGE,

    // Argument
    ERR_EMPTY_ARGUMENT_NAME,
    ERR_ENFORCED_POSITION_POSITIVE,
    ERR_NON_PARAMETER_HANDLER,
    ERR_NON_PARAMETER_EXPECTED_ARGUMENT,
    ERR_ROUNDTO_NOT_POSITIVE,
    ERR_NULL_HANDLER,
    ERR_EXPECTED_ARGUMENTS_NEGATIVE,
    ERR_DUPLICATE_ARGUMENTS_NEGATIVE,
    ERR_NON_PARAMETER_ARGUMENT_DUPLICATION,

    // Command
    ERR_EXPECTED_ARGUMENT,

    // Command Factory
    ERR_UNKNOWN_COMMAND,
    ERR_EMPTY_ARGUMENT,

    // GeoConsole
    GEO_VERSION,
    ERR_EXITED,
    ERR_EMPTY_INPUT,

    // Exceptions
    ERR_PARAMETER_DUPLICATE_AT_PART,
    ERR_INVALID_PARAMETER_AT_PART,
    ERR_REQUIRED_FIRST_PART,
    ERR_REQUIRED_AFTER_PART,

    // Context
    ERR_SPECIFIED_FIGURE_MISSING,
    ERR_INCORRECT_FIGURE_ID,

    // Arguments Handler
    ERR_HANDLER_ARGUMENT_UNMATCHED_NUMBER,
    ERR_HANDLER_TOO_MANY_ARGUMENTS,
    ERR_HANDLER_UNSPECIFIED_ARGUMENT_AT
}
