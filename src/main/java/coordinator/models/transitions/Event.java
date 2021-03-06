package coordinator.models.transitions;

public enum Event {
    // Success
    TransferAccepted,

    ValidationStarted,
    ValidationSucceded,
    AdhocValidationRequested,
    
    BalanceStarted,
    BalanceSucceded,

    SignalingStarted,
    SignalingSucceded,
    AdhocSignalingRequested,

    ReceiptStarted,
    ReceiptSucceded,
    AdhocReceiptRequested,
    
    // Errors
    ValidationFailed,
    ValidationError,
    BalanceError,
    SignalingError,
    ReceiptError,
    TransferFailed,

    //Undo
    UndoAllRequested,
    SignalingUndoStarted,
    SignalingUndoSucceded,
    BalanceUndoStarted,
    BalanceUndoFinished,
    UndoAllFinished
}
