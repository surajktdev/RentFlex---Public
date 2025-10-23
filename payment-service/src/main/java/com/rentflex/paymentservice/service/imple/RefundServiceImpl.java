package com.rentflex.paymentservice.service.imple;

import com.rentflex.paymentservice.DTO.RefundRequestDTO;
import com.rentflex.paymentservice.DTO.RefundResponseDTO;
import com.rentflex.paymentservice.model.Refund;
import com.rentflex.paymentservice.model.RefundStatus;
import com.rentflex.paymentservice.repository.RefundRepository;
import com.rentflex.paymentservice.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RefundServiceImpl implements RefundService {


    @Autowired
    private RefundRepository refundRepository;

    @Override
    public RefundResponseDTO initiateRefund(RefundRequestDTO request) {
        Refund refund = new Refund();
        refund.setTransactionId(request.transactionId());
        refund.setRefundAmount(request.refundAmount());
        refund.setReason(request.reason());
        refund.setRefundDate(LocalDateTime.now());
        refund.setRefundStatus(RefundStatus.INITIATED);

        refund = refundRepository.save(refund);
        return new RefundResponseDTO(refund);
    }

    @Override
    public void updateRefundStatus(Long refundId, String status) {
        Refund refund = refundRepository.findById(refundId)
                .orElseThrow(() -> new RuntimeException("Refund not found"));

        refund.setRefundStatus(RefundStatus.valueOf(status));
        refundRepository.save(refund);
    }

    @Override
    public RefundResponseDTO getRefundById(Long refundId) {
        Refund refund = refundRepository.findById(refundId)
                .orElseThrow(() -> new RuntimeException("Refund not found"));
        return new RefundResponseDTO(refund);
    }

    @Override
    public RefundResponseDTO getRefundByTransaction(String transactionId) {
        Refund refund = refundRepository.findByTransactionId(transactionId)
                .orElseThrow(() -> new RuntimeException("Refund not found"));
        return new RefundResponseDTO(refund);
    }

    @Override
    public List<RefundResponseDTO> getAllRefunds() {
        return refundRepository.findAll()
                .stream()
                .map(RefundResponseDTO::new)
                .collect(Collectors.toList());
    }
}
