package il.receiver.external;

import il.receiver.external.dto.vflat.FreeFlatInput;
import il.receiver.external.dto.vflat.FreeVFlatResponse;

public interface TogoApiService {
    FreeVFlatResponse receiveFreeVehicles(FreeFlatInput freeFlatInput);
}
