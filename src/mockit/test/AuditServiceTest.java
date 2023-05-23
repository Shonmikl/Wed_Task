package mockit.test;

import mockit.mock.*;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

//@ExtendWith(MockitoExtension.class)
public class AuditServiceTest {

    @Mock
    TradeRepository tradeRepository;

    @Mock
    Trade trade;

    @Mock
    AuditService auditService;

    @Test
    void testAuditService() {
        Mockito.when(tradeRepository.createTrade(trade)).thenReturn(Mockito.anyLong());
        TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
        tradingService.createTrade(trade);

        Mockito.verify(auditService).logNewTrade(trade);
    }
}