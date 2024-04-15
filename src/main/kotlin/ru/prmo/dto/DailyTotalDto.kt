package ru.prmo.dto

import java.time.LocalDate

data class DailyTotalDto(
    var operationRecords: MutableList<OperationRecordDto> = mutableListOf(),
    var stringOperationRecords: MutableList<StringOperationRecordDto> = mutableListOf(),
    var date: LocalDate?     // format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
) {
    fun addRecord(record: OperationRecordDto) {
        this.operationRecords.add(record)
    }

    fun addStringRecord(record: StringOperationRecordDto) {
        this.stringOperationRecords.add(record)
    }
}
